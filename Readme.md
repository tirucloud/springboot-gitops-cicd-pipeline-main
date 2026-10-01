# End-to-End CI/CD Pipeline with Jenkins, Docker, Kubernetes and ArgoCD

## Project Overview

This project demonstrates a complete CI/CD and GitOps workflow using Jenkins, Docker, Kubernetes, and ArgoCD.

The application is built using Spring Boot, containerized using Docker, deployed on Kubernetes (Minikube), and continuously synchronized using ArgoCD.

---

## Architecture

Developer
↓
GitHub
↓
Jenkins
↓
Maven Build
↓
Docker Build
↓
DockerHub
↓
Update Kubernetes Manifests
↓
GitHub
↓
ArgoCD
↓
Kubernetes (Minikube)
↓
Spring Boot Application

---

## Technologies Used

* Jenkins
* GitHub
* Maven
* Docker
* DockerHub
* Kubernetes
* Minikube
* ArgoCD
* Spring Boot

---

## Features

* Automated CI/CD Pipeline
* Docker Image Build and Push
* Kubernetes Deployment
* GitOps-based Deployment using ArgoCD
* Continuous Synchronization
* Automated Rollouts

---
## SONARQUBE
- http://sonar-ip/admin/webhooks

- create webhook

- name: sonar-webhook
- webhook URL: http://jenkins-ip:8080/sonarqube-webhook/
- Create sonar-token
- http://sonar-ip/account/security

## Deployment Verification

```bash
kubectl get deploy
kubectl get pods
kubectl get svc
kubectl get applications -A
```

---

## Challenges Faced

While integrating ArgoCD with Kubernetes, the application continuously remained in an Unknown/Missing state.

Error:

groupVersion shouldn't be empty

After extensive debugging of ArgoCD controllers, Kubernetes resources, manifests and cluster connectivity, the root cause was identified as an accidental '' character before apiVersion in deployment.yaml.

Fixing the deployment manifest and re-syncing the application resolved the issue and the application successfully reached Healthy and Synced state.

---

## Final Result

* Spring Boot Application Running
* Kubernetes Deployment Available
* Service Exposed via NodePort
* ArgoCD Healthy & Synced
* GitOps Workflow Operational

---

## Repository Structure

springboot-gitops-cicd-pipeline
├── Kubernetes
├── Springboot-app
├── Dockerfile
├── Jenkinsfile
└── README.md
