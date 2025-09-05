# 🚀 CI/CD Demo Project

Welcome! This project demonstrates:

- 🤖 **CI/CD with GitHub Workflows**
- 📦 **Artifact management with Artifactory**
- ☸️ **Kubernetes deployment capabilities**

## 🛠️ Features

- Automated build, test, and deploy pipelines using GitHub Actions
- Publishing and retrieving build artifacts from ghcr artifactory
- Deploying applications to a Kubernetes cluster

## 🚦 Getting Started

1. **Clone the repository**
2. **Configure GitHub Secrets** for Artifactory and K8s access
3. **Push code** to trigger the CI/CD pipeline

## 📂 Project Structure

- `.github/workflows/` — CI/CD pipeline definitions
- `src/` — Application source code
- `helm/` — Helm charts for Kubernetes deployment

## 🚀 Deploy to Minikube

> **Note to self:** This setup assumes the Helm chart does not require private credentials or image pull secrets.  
> If deployment needs credentials (e.g., for private container registries), I must configure them in the Helm chart or Kubernetes cluster.  
> This guide does not cover credential setup.

```bash

minikube start
helm install cicd-k8s ./helm --namespace cicd-k8s --create-namespace
kubectl get pods -n cicd-k8s
kubectl port-forward svc/cicd-k8s 8080:80 -n cicd-k8s
minikube stop
``` 