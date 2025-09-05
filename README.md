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